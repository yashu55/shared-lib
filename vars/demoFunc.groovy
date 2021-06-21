
import com.demo.insideFunc

def call(){
	def helloVar = new insideFunc()
	pipeline {
		agent any

		stages {
			stage('wtrt') {
				steps {
					echo 'Hello dgdfgdfg'
				}
			}
			stage('dwetwtef') {
				steps {
					helloVar.hello()
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

// def functionDemo(){
	
// }




