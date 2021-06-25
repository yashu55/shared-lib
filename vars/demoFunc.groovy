
def  call(Map pipelineParams){
	pipeline {
	agent any
		stages{
			stage("Hi") {
				when{
					allOf {
					equals expected: "ANSIBLE", actual: pipelineParams.type
					expression { !pipelineParams.path?.trim() || pipelineParams.path?.trim() == 'none'}
					}
				}
				steps{      
					script{
						echo pipelineParams.type
					}
				}
				
			}	
		}
	}
}






