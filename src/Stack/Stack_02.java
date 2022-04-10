package Stack;

// javascript
function solution(priorities, location) {
    let answer = 0;
    let cut = 1;

    while(true){
        let num = priorities[0]
        if(priorities.some( (priorities) => priorities > num ) ) {

            let temp = priorities.shift();
            priorities.push(temp);

            if(location == 0) location = priorities.length-1;
            else location--;

        }
    else {
            if(location == 0){
                answer = cut;
                break;
            }
            priorities.shift();
            location--;
            cut++;
        }
    }



    return answer;
}

