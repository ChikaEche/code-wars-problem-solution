export class G964 {
   
    public static longest = (s1, s2) => {
      let newS =s1 + s2;
      let newSarr = []

  newS.split("").sort((a,b) => a < b ? -1 : 1)
  .map(a => {
    if (newSarr.indexOf(a) < 0) {
      newSarr.push(a);
    }
  }
  );
  return newSarr.join("");
    }    
}