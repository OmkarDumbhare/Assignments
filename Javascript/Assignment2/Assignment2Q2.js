function square(x){
    return x*x;
}
function double(x){
    return 2*x;
}
function compose(func1,func2,f)
{
   return(func1(func2(f)));
}

