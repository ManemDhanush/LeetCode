/**
 * @param {number} n
 * @return {number[]}
 */
var lexicalOrder = function(n) {
    var ans = [];
    for(var i=1; i<=n; i++){
        ans.push(i);
    }
    ans.sort();
    return ans;
};