
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

	if(true)
		println("Helllo")

			stage("Init"){
				node{
					script{
					echo "Heldfsgdfglo"
					}
					
				}
			}

			stage("Hi") {
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






