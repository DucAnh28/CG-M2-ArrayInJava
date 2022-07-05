public class Test {
    public static void main(String[] args) {
        let cc = 0
        let cp = 0
        for (let i = 0; i < array.length; i++) {
            for (let j = 0; j < array[i].length; j++) {
                if (i === j) {
                    cc += array[i][j]
                }
                //array[i][i]
                if (i + j === array.length -1) {
                    cp += array[i][j]
                }
            }
        }
        console.log(Math.abs(cc - cp))

        let cc1 = 0
        let cp1 = 0
        for (let i = 0; i < array.length; i++) {
            cc1 += array[i][i]
            cp1 += array[i][array.length - 1 - i]
        }
        console.log(Math.abs(cc1 - cp1))
    }
}
