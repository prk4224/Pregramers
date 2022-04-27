////javascript
//
//    function solution(bridge_length,weight,truck_weights){
//        let answer=0;
//        let temp=[];
//
//        for(let i=0;i<bridge_length; i++){
//        temp.push(0);
//        }
//
//        while(temp.length){
//            temp.shift();
//            answer++;
//
//            if(truck_weights.length){
//                let sum=temp.reduce(function add(prev,curr){
//                return prev+curr
//                });
//
//                if(sum+truck_weights[0]<=weight){
//                     temp.push(truck_weights.shift());
//                }
//                else temp.push(0);
//            }
//        }
//        return answer;
//    }