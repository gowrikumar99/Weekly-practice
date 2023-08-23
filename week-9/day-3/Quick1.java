// quick sort uses divide and conquer approach
// it uses a pivote elementes to devide the array in two parts
// there are many ways to find pivote elementes,we can select the first element as pivot
//or the middle element or the last element as pivote


//  50 30 10 90 80 20 40 70  // here 50 is a pivot element
//  0  1   2  3 4  5  6  7  
//  left value<= pivot value;
//  right value> povite value;

// 50<=50 condition is satisfied increse the i value.
// 50<30  condition is satisfied increse the i value.
// 50<10  condition is satisfied increse the i value.
// 50<90  condition is not satisfied j index (right side).BUT fixed i value 3 index(19).
// 50>70  condition is true decrese the j value.
// 50>40 condition is not satisfied but(j index value at 40).
 // then after swaping i value and j values

//  after swaping 
// 50 30 10 40 80 20 90 70
             i        j  
// 40<50 condition is true  // l.v<pv
// 80<50 condition is false // l.v<pv
// 90>50 condition true  .then after j value decresing (moving backword direction.)   // r.v>p.v
// 20>50 this condition is false
// after this i value and j values are(j value forward direction lo untea matramea) pakkapakkanea untea swap cheyali


             //  after that
               
// 50 30 10 40 20 80 90 70
//             i  j
// 20<50 condition is true increse i value 
// 80<50 condition is false take j index value
// 80>50 condition is true decrese the j value.
//    50 30 10  40 20 80 90 70
//                 j  i
// 20>50 condition is false here crassing j value with i .then
//          j value exchange with pivot value
               
// 20 30 10 40 50 80 90 70  // here 50 is povote value
// 


               
// 20 30 10 40  here pivote value is 20
//  i        j
               //20<=20 condition is true
               // 30<20 condition is false now i index value moving forward direction then after reght side j value

               // 40>20 this condition is true.
               // 10>20 this condition is false.
               // 20 30 10 40
               //    i  j // ela pakkapakkanea untea swap cheyali
               // 20 10 30 40
               //     i j  
               // 30>20 condition is true decrese j value
               // 10>20 condition is fail NOW crassing thej into i then pivot value change in j value
               // 20 10 30 40
              //     j  i
               //out put 10 20 30 40


// 80 90 70  // here pivot value is 80 and i value is 80 and j value is 70
// 5   6  7  index positions

               // 80<90 condition is true
               // 80<70 condition is false i value at (1 index position);
               //then after j right side
               // 80 90 70
               //     i  j
               
               // 70>80 condion is false and beside the i and j values
               // 80 70 90
               //    j  i 
               // now crassing i value and j values
               // 70 80 90

      // we are getting 
            //  10 20 30 40 50 70 80 90
               
           