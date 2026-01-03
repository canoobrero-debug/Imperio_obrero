precision mediump float;
varying vec2 vTextureCoord;
uniform sampler2D sTexture;
void main() {
    vec4 color = texture2D(sTexture, vTextureCoord);
    // Suavizado de piel y realce de brillo dorado (Zenith Style)
    float luminance = dot(color.rgb, vec3(0.299, 0.587, 0.114));
    vec3 beauty = mix(color.rgb, vec3(luminance), -0.2);
    gl_FragColor = vec4(beauty + vec3(0.05, 0.03, 0.0), color.a);
}
