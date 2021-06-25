
def  call(Map pipelineParams){
	node ("any") {
			stage("Init"){
				echo "Heldfsgdfglo"
			}

			stage("Hi") {
				
				agent any
				echo "sgfg"		
			}	
	}
	node ("any") {
			stage("fgdfg"){
				echo "Hello"
			}

			stage("dfgdg") {
				
				agent any
				echo "Hi"		
			}	
	}
}






