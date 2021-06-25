
def  call(Map pipelineParams){
	node {
			stage("Init"){
						echo "Hello"
			}

			stage("Hi") {
						echo "Hi"	
			}	
		
	}
}






