
def  call(Map pipelineParams){
	node  {
		label any
		properties([
        buildDiscarder(
                logRotator(
                        artifactDaysToKeepStr: '', 
                        artifactNumToKeepStr: '', 
                        daysToKeepStr: '', 
                        numToKeepStr: '')
        ), 
        disableConcurrentBuilds()
])
			stage("Init"){
				echo "Heldfsgdfglo"
			}

			stage("Hi") {
				
				echo "sgfg"		
			}	
	}
	node  {
			label any
			stage("fgdfg"){
				withCredentials([usernameColonPassword(credentialsId: 'user_pass', variable: 'user')]) {
					echo user
					}
			}

			stage("dfgdg") {
				
				echo "Hi"		
			}	
	}
}






