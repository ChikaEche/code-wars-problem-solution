export function sumDigits(number: number): number {
    if (number < 0) {
      number = number * -1;
    }
    let numberString = number + "";
    let newNum = numberString.split("")
    .reduce((a,b) => {
      let acc = Math.abs(+(a)) + Math.abs(+(b));
      return (acc + "")
      }
      );
      let newN = +(newNum)
    return newN
    }