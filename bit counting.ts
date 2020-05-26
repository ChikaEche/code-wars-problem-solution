export function countBits(n: number) {
    let remainderList = [];
    let remainder = 0;
    while (true) {
      if (n === 0 ) {
        break;
      }
      remainder = n % 2;
      n = Math.floor(n/2)
      remainderList.push(remainder);
      }
      let num = remainderList.filter(x => x === 1);
      return num.length;
  }