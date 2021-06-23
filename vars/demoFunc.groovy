
def  call(){
pipeline {
	agent any
    stages{
       stage("bye"){
          steps{
				echo "SCP"
				echo "SCP"
				echo "SCP"
				echo "SCP"
				input 'Proceed?'
          }
          
       }
    }
}
		
}






