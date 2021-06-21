
def  call(){
	pipeline {
		agent any

		stages {
			stage('wtrt') {
				steps {
				   
				      				demoFunc.abc()
  
				  
				}
			}
			stage('dwetwtef') {
				steps {
					echo 'fgsfgsg'
				}
			}
			stage('hiwewetj') {
				steps {
					echo 'Hello'
				}
			}
		}
	}
}

def  abc(){
	sh "echo hello"

}






