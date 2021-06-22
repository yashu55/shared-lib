
def  call(){
	
		stages {
			stage('ANSIBLE') {
				when { equals expected: 'ANSIBLE', actual: env.CHOICE }
				steps{
					echo "Ansible"
				}
			}
			stage('TRANSPORTER') {
				when { equals expected: 'TRANSPORTER', actual: env.CHOICE }
				steps{
					echo "Transporter"
				}
			}
			stage('SCP') {
				when { equals expected: 'SCP', actual: env.CHOICE }
				steps{
					echo "SCP"
				}
			}
		}
	
}






