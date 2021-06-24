
def  call(
	String configPath,
	String ruleSetPath = null,
	String excludePath = 'none',
	String[] hosts = null

){

	if(!ruleSetPath)
		{
			echo ruleSetPath
		}
	if(excludePath != 'none'){
		echo "inside if cond ${excludePath}" 
	}
	echo configPath

		
}






