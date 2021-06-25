
def  call(Map pipelineParams){
	pipeline {
	agent any
		stages{

			stage("Init"){

				steps{      
					script{
					pipelineParams.type = pipelineParams.type?.trim()
					pipelineParams.path = "asdfghjhgfdsdfghgfd"
					if(null == pipelineParams.type)
						error("type is null")
					}
				}
			}

			stage("Hi") {
				// when{
				// 	allOf {
				// 	equals expected: "ANSIBLE", actual: pipelineParams.type
				// 	expression { !pipelineParams.path || pipelineParams.path == 'none'}
				// 	}
				// }
				steps{      
					script{
						echo pipelineParams.type
						echo pipelineParams.path

					}
				}
				
			}	
		}
	}
}






