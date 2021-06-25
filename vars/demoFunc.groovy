
def  call(Map pipelineParams){
	node  {
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
			stage("fgdfg"){
				echo "Hello"
			}

			stage("dfgdg") {
				
				echo "Hi"		
			}	
	}
}






