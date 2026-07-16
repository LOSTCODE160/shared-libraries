def call(String branch, String url) {

    git branch: branch,
        url: url

    echo 'the code has been cloned from the source'
}
