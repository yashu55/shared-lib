


def  call(Map pipelineParams){
	def request = libraryResource 'configValidationYAML/script.sh'
	writeFile(file: "script.sh", text: request)
	sh "ls -la"
	sh "chmod 777 script.sh"
    sh "./script.sh"
}






