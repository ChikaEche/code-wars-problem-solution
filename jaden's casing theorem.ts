String.prototype.toJadenCase = function () {

    let str = '';
    return this.split(' ')
    .map(x => x.replace(x.split('')[0],x.split('')[0].toUpperCase()) )
    .join(' ');
    };