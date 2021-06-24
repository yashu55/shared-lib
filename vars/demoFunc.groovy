
def  call(
	String configPath,
	String ruleSetPath = null,
	String excludePath = 'none',
	String[] hosts = []

){

	if(ruleSetPath)
		{
			echo ruleSetPath
		}
	if(excludePath == 'nome'){
		echo "inside if cond ${excludePath}" 
	}
	echo configPath

		
}






