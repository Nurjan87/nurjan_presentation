node{
    stage("Go to Terraform"){
        sh "ssh ec2-user@18.220.132.65 https://github.com/Nurjan87/nurjan_presentation.git"
        sh "ssh ec2-user@18.220.132.65 cd nurjan_presentation && terraform init"
        sh "ssh ec2-user@18.220.132.65 cd nurjan_presentation && terraform apply"
    }
}