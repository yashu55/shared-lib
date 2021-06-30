


def  call(Map pipelineParams){
	def request = libraryResource 'script.sh'
	writeFile(file: "script.sh", text: request)
}






