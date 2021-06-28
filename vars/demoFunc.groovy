
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
			stage("Init"){
				node{
					echo "Heldfsgdfglo"
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






