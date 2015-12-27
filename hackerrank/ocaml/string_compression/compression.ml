
let fold_left f accu str = 
  let n = String.length str in
    let accu_ref = ref accu in
      for i = 0 to n-1 do
        accu_ref := f !accu_ref str.[i]
      done;
      !accu_ref;;

let suffix str c =
  let n = String.length str in
    n > 0 && str.[n-1] = c;;

let num n = 
  if n >= 2 then string_of_int n
  else "";;
  
let calc a c =
  let (s, n) = a in
    if suffix s c then (s, n+1)
    else (s ^ num n ^ Char.escaped c, 1);;

let solve s = 
  let r = fold_left calc ("", 0) s in
  print_string (fst r ^ num (snd r));;

Scanf.scanf "%s" solve;;
