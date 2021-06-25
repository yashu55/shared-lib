
def  call(Map pipelineParams){
	node {
			stage("Init"){
				agent any
				echo "Hello"
				
			}

			stage("Hi") {
				
				agent any
				echo "Hi"

				
				
			}	
		
	}
}






