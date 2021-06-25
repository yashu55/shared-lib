
def  call(Map pipelineParams){
	node {
			stage("Init"){
				steps{      
					script{
						echo "Hello"
					}
				}
			}

			stage("Hi") {
				
				steps{      
					script{
						echo "Hi"

					}
				}
				
			}	
		
	}
}






