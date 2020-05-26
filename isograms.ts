export function isIsogram(str: string){
    let dCopy: string[] = [];
    
      let check = str.split("").every(x => {
        if (dCopy.indexOf(x.toLowerCase()) >= 0) {
          return false;
        }
        dCopy.push(x.toLowerCase());
        return true;
      })
      return check;
      //...
    }