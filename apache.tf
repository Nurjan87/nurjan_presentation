resource "aws_instance" "web" {
  ami                         = ami-0019ef04ac50be30f
  instance_type               = t2.micro
  count                       = 1
  key_name                    = ec2-nur
  subnet_id                   = subnet-6e764b35
  associate_public_ip_address = "true"
  
  user_data = "${file("userdata.sh")}"
