resource "aws_instance" "dev" {
  provider      = aws.virginia
  ami           = "ami-0c02fb55956c7d316"
  instance_type = "t2.micro"
  key_name      = "terraform-aws"
  tags          = {
    Name  = "dev"
    Squad = "Cartões"
  }
  provisioner "local-exec" {
    command = "echo Finished"
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

