

def  call(){
	pipeline {
		agent any
		parameters {
			choice(name: 'CHOICE', choices: ['ANSIBLE', 'TRANSPORTER', 'SCP'], description: 'Pick something')
    	}
		stages {
			stage('ANSIBLE') {
				stages{
					stage("Ansible 1"){
						steps{
							echo "A1"
						}
					}
					stage("Ansible 2"){
						steps{
							echo "A2"
						}
					}
					stage("Ansible 3"){
						steps{
							echo "A3"
						}
					}
				}
			}
			stage('TRANSPORTER') {
				stages{
					stage("TRANS 1"){
						steps{
							echo "A1"
						}
					}
					stage("TRANS 2"){
						steps{
							echo "A2"
						}
					}
					stage("TRANS 3"){
						steps{
							echo "A3"
						}
					}
				}
			}
			stage('SCP') {
			stages{
					stage("SCP 1"){
						steps{
							echo "A1"
						}
					}
					stage("SCP 2"){
						steps{
							echo "A2"
						}
					}
					stage("SCP 3"){
						steps{
							echo "A3"
						}
					}
				}
			}
		}
	}
}






