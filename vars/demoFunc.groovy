
def  call(Map pipelineParams){
// 	node  {
		
// 		properties([
//         buildDiscarder(
//                 logRotator(
//                         artifactDaysToKeepStr: '', 
//                         artifactNumToKeepStr: '', 
//                         daysToKeepStr: '', 
//                         numToKeepStr: '')
//         ), 
//         disableConcurrentBuilds()
// ])

	// if(false)
	// 	println("byeeeeeeeeeee")
	// else
	// 	error("errrrorrrrr")
			stage("Init"){
				node{
					script{
					echo "Heldfsgdfglo"
					}
					
				}
			}

			stage("Hi") {
				when {equals expected: "Hello", actual: "Hello"}
				echo "sgfg"		
			}	
	//}
	// node  {
			
	// 		stage("fgdfg"){
	// 			withCredentials([usernameColonPassword(credentialsId: 'user_pass', variable: 'user')]) {
	// 				echo user
	// 				}
	// 		}

	// 		stage("dfgdg") {
				
	// 			echo "Hi"		
	// 		}	
	// }
}






