#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_cosmo_empire_security_Cipher_encrypt(JNIEnv* env, jobject thiz, jstring input) {
    const char* str = env->GetStringUTFChars(input, 0);
    std::string data(str);
    for(char &c : data) c ^= 0xFF; // Cifrado XOR total
    return env->NewStringUTF(data.c_str());
}
