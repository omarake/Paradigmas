% This buffer is for notes you don't want to save.
% If you want to create a file, visit that file with C-x C-f,
% then enter the text in that file's own buffer.

%resta de dos variables
resta:- write('ingrese el primer valor='),
read(A),
write('ingrese el segundo valor'),
read(B),
    C is A-B,
format('el resultado es ~w',[C]).
