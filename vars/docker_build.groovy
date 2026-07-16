def call(String ProjectName,string ImageTag string DockerHubUser){
 sh " docker build  -t ${DockerHubUser}/${ProjectName}:${ImageTag} . "
 echo 'this the build stage' 
}



