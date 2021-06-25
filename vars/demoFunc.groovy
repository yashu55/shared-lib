
def  call(Map pipelineParams){
	node {
	agent any
		stages{

			stage("Init"){

				steps{      
					script{
					pipelineParams.type = pipelineParams.type?.trim().toUpperCase()
					if( pipelineParams.type != 'ANSIBLE' && pipelineParams.type != 'TRANSPORTER' && pipelineParams.type != 'SCP' ){
						error("type is null")
					}
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






