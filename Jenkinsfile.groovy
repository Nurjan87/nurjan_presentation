node{
    stage("Pull git"){
        git 'git@github.com:Nurjan87/nurjan_presentation.git'
    }
    stage("Terraform init and apply"){
        sh "terraform init"
        sh "terraform apply --auto-approve"
    }
}