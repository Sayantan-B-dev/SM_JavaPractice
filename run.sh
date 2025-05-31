var=ForEach

echo "Running $var"
mkdir "$var"
cd "$var" || exit
touch "$var.java"
code "$var.java"
