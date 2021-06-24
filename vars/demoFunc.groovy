
def  call(
	Map m

){

	if(!m.ruleSetPath)
		{
			echo m.ruleSetPath
		}
	if(m.excludePath != 'none'){
		echo "inside if cond ${m.excludePath}" 
	}
	echo m.configPath

		
}






