
def call(){
	functionDemo()
}

def functionDemo(){
	pipeline {
		agent any

		stages {
			stage('abc') {
				steps {
					echo 'Hello dgdfgdfg'
				}
			}
			stage('def') {
				steps {
					echo 'Hellodfgdg'
				}
			}
			stage('hij') {
				steps {
					echo 'Hello'
				}
			}
		}
	}
}




