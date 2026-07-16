def call(String ProjectName,String ImageTag,String DockerHubUser){
 sh " docker tag ${ProjectName}:${ImageTag} ${DockerHubUser}/${ProjectName}:${ImageTag}  "
 echo "image is tagged" 
sh " docker push ${DockerHubUser}/${ProjectName}:${ImageTag} "
echo " image is pushed"
}
