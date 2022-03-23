resource "aws_load_balancer_backend_server_policy" "load_balance" {
  provider           = "aws.virginia"
  instance_port      = 80
  load_balancer_name = "load_balance_dev"
  depends_on         = [aws_instance.dev]
}

resource "aws_instance" "dev" {
  provider      = "aws.virginia"
  count         = 2
  ami           = ""
  instance_type = "t2.micro"
  key_name      = "terraform-aws"
  tags          = {
    Name  = "dev1"
    Squad = "Cartões"
  }
  depends_on = [aws_dynamodb_table.dynamodb_table_read_target]
}

resource "aws_dynamodb_table" "dynamodb_table_read_target" {
  provider     = aws.virginia
  count        = 1
  name         = "table_test"
  billing_mode = "PAY_PER_REQUEST"
  hash_key     = "UserId"
  attribute {
    name = "UserId"
    type = "S"
  }
}

