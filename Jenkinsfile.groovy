node{
    stage("Go to Terraform"){
        sh "ssh root@18.220.132.65 git clone https://github.com/Nurjan87/nurjan_presentation.git"
        sh "ssh root@18.220.132.65 cd nurjan_presentation && terraform init"
        sh "ssh root@18.220.132.65 cd nurjan_presentation && terraform apply"
    }
}