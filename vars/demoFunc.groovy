
import com.demo.insideFunc

def call(){
	def helloVar = new insideFunc()
	helloVar.hello()
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
					echo 'fggh'
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




