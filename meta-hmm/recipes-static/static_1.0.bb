DESCRIPTION="build my custom heap memory manager as a static library"
PR="r1"

SRCDIR="${TOPDIR}/../meta-hmm/source"

do_build(){
    gcc -c ${SRCDIR}/hmm.c -o ${SRCDIR}/hmm.o
    gcc -c ${SRCDIR}/list.c -o ${SRCDIR}/list.o
    ar -rs ${SRCDIR}/libhmm.a ${SRCDIR}/hmm.o ${SRCDIR}/list.o
}
