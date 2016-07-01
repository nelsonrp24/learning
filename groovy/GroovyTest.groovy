println "Hello World....!!!!"


def s1='Single quote string'
def s2="Double quote string"

def s3="""This is multi line string
you can write multiple lines here."""

def s4="Example of Gstring, you can refer to varibale alse like ${s1}"

   def condition1 = true
   int condition2 = 1
   if(condition1){
     println("Condition 1 satisfied")
     if(condition2){
       println("Condition 2 satisfied")
     }else{
       println("Condition 2 failed")
     }
   }else{
     println("Condition 1 failed")
}
