function lostFragment() {
    const sentWords = sent.split(" ");
    const receivedWords = received.split(" ");

    const result = [];
    let i = 0;
    let j = 0;

    while(i < sentWords.length){
        if(j < receivedWords.length && sentWords[i] === receivedWords[j]){
            j++;
            i++;
        }
        else{
            result.push(sentWords[i]);
            i++;
        }
    }
    return result;
}

console.log(lostFragment("I am using HackerRank to improve programming", "am HackerRank to improve")); // Output: [ 'I', 'using', 'programming' ]