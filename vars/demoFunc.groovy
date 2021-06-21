
import com.demo.insideFunc

def helloVar = new insideFunc()
def call(){
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
					echo helloVar.hello()
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




