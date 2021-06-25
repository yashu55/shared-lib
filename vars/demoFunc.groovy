
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
				
				agent any
				echo "sgfg"		
			}	
	}
	node  {
			stage("fgdfg"){
				echo "Hello"
			}

			stage("dfgdg") {
				
				agent any
				echo "Hi"		
			}	
	}
}






