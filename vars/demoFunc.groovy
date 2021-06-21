
@Library('shared-lib@master') _

def  call(){
	pipeline {
		agent any

		stages {
			stage('wtrt') {
				steps {
				   script{
						demoFunc.abc()
				   }
  
				  
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






