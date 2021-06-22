
def  call(){
	pipeline {
		agent any
		parameters {
			choice(name: 'CHOICE', choices: ['ANSIBLE', 'TRANSPORTER', 'SCP'], description: 'Pick something')
    	}
		stages {
			stage('ANSIBLE') {
				when { equals expected: 'ANSIBLE', actual: params.CHOICE }
				steps{
					echo "Ansible"
				}
			}
			stage('TRANSPORTER') {
				when { equals expected: 'TRANSPORTER', actual: params.CHOICE }
				steps{
					echo "Transporter"
				}
			}
			stage('SCP') {
				when { equals expected: 'SCP', actual: params.CHOICE }
				steps{
					echo "SCP"
				}
			}
		}
	}
}






